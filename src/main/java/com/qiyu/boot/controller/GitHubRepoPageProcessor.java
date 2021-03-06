package com.qiyu.boot.controller;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientGenerator;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @author qiyu
 * @date 2018/11/19
 */
public class GitHubRepoPageProcessor implements PageProcessor {

    private int a ;


    private Site site = Site.me().setRetrySleepTime(100).setRetryTimes(3);


    @Override
    public void process(Page page) {
        page.addTargetRequests(page.getHtml().links().regex("(https://github\\\\.com/\\\\w+/\\\\w+)").all());
        page.putField("author", page.getHtml().regex("<title>(.*)</title>").toString());
        page.putField("contributions", page.getHtml().xpath("//h2[@class='f4 text-normal mb-2']/text()").toString());
        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/[\\w\\-]+/[\\w\\-]+)").all());
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        System.out.println(HttpClientGenerator.class.getClassLoader());
        System.out.println("**************************");
        Spider.create(new GitHubRepoPageProcessor()).addUrl("https://github.com/hfutqy").thread(1).run();


    }
}
