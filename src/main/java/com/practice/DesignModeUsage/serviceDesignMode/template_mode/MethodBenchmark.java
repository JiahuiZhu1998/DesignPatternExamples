package com.practice.DesignModeUsage.serviceDesignMode.template_mode;

public class MethodBenchmark extends Benchmark {

    /**
     * 真正定义 benchmark 内容
     */
    @Override
    public void benchmark() {
        for (int i=0; i < Integer.MAX_VALUE; i++) {
            System.out.println("i=" + i);
        }
    }


    //具体模板模式如何调用
    public static void main (String[] args) {
        Benchmark operation = new MethodBenchmark();
        long duration = operation.repeat(Integer.parseInt(args[0].trim()));
        System.out.println("The operation took " + duration + " milliseconds");
    }
}
