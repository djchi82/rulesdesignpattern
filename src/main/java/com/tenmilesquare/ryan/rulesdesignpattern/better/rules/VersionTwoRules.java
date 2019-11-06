package com.tenmilesquare.ryan.rulesdesignpattern.better.rules;

import com.tenmilesquare.ryan.rulesdesignpattern.Recording;

import java.util.ArrayList;
import java.util.List;


public class VersionTwoRules implements IRule {
    public boolean shouldRun(Recording recording) {
        return Recording.RECORDING_VERSIONS.v2.equals(recording.getVersion());
    }

    public List<String> runRule(Recording recording) {
        List<String> errors = new ArrayList<String>();
        if(RulesUtilities.isBlankOrNull(recording.getTitle())){
            errors.add("Recording title is blank or null");
        }

        if(RulesUtilities.isBlankOrNull(recording.getArtist())){
            errors.add("Recording artist is blank or null");
        }
        if(RulesUtilities.isBlankOrNull(recording.getComposer())){
            errors.add("Recording composer is blank or null");
        }
        return errors;
    }
}
