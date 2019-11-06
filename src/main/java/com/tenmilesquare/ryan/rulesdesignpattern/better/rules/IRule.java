package com.tenmilesquare.ryan.rulesdesignpattern.better.rules;

import com.tenmilesquare.ryan.rulesdesignpattern.Recording;

import java.util.List;

public interface IRule {

    public boolean shouldRun(Recording recording);
    public List<String> runRule(Recording recording);

}
