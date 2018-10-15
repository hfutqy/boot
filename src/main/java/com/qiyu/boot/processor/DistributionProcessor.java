package com.qiyu.boot.processor;

import com.google.common.collect.Lists;
import com.qiyu.boot.common.IBusinessProcessor;
import com.qiyu.boot.common.IBusinessType;
import com.qiyu.boot.processor.context.IContext;
import com.qiyu.boot.processor.result.IProcessResult;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author qiyu
 * @date 2018/10/15
 */
public class DistributionProcessor implements IDistributionProcessor {

    @Resource
    private List<IBusinessProcessor> businessProcessorList;

    @Override
    public IProcessResult process(String context, IBusinessType businessType) throws ProcessException {
        return null;
    }

    @Override
    public IProcessResult process(IContext context, IBusinessType businessType) throws ProcessException {
        return null;
    }

    @Override
    public List<IBusinessProcessor> getBusinessProcessors(IBusinessType businessType) {
        if (businessProcessorList == null) {
            return null;
        }
        List<IBusinessProcessor> resultList = businessProcessorList.stream().filter(
                processor -> processor.match(businessType)).collect(Collectors.toList());
        return resultList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Stream<Integer> sa = list.stream();
        Stream<Integer> b = sa.filter((n) -> {
            System.out.printf("filter:" + n);
            return n % 2 == 0;
        });

        Stream<Integer> c = b.map((n) -> {
            System.out.printf("map:" + n);

            return n + 1;
        });
        c.forEach(System.out::println);
    }
}
