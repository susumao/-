package com.aguo.wxpush.service;

public interface ProverbService {
    /**
     * 这个接口很奇怪，可能会返回奇奇怪怪的句子。但是这个无需注册申请免费用
     *
     * @return
     */
    String getOneProverbRandom();

    String translateToEnglish(String sentence);

    /**
     * 得到正常的句子，需要注册申请。
     * @return
     */
    String getOneNormalProverb();
}
