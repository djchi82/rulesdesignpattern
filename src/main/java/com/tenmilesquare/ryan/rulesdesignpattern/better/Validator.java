package com.tenmilesquare.ryan.rulesdesignpattern.better;

import com.tenmilesquare.ryan.rulesdesignpattern.Recording;
import com.tenmilesquare.ryan.rulesdesignpattern.better.rules.IRule;
import com.tenmilesquare.ryan.rulesdesignpattern.better.rules.VersionOneRules;
import com.tenmilesquare.ryan.rulesdesignpattern.better.rules.VersionTwoRules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Validator {

    private final List<IRule> rules;
    public Validator(){
        rules = Collections.unmodifiableList(Arrays.asList(new VersionOneRules(), new VersionTwoRules()));
    }

    public List<String> validateRecordings(Recording recording){
        if (recording == null){
            return Arrays.asList("Recording is null");
        }

        List<String> errors = new ArrayList<String>();
        for ( IRule rule : rules){
            if(rule.shouldRun(recording)){
                errors.addAll(rule.runRule(recording));
            }
        }
        return errors;
    }
}
