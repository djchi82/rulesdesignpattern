package com.tenmilesquare.ryan.rulesdesignpattern.better.rules;

import com.tenmilesquare.ryan.rulesdesignpattern.Recording;

import java.util.ArrayList;
import java.util.List;

public class VersionOneRules implements IRule {

    public boolean shouldRun(Recording recording) {
        return Recording.RECORDING_VERSIONS.v1.equals(recording.getVersion());
    }

    public List<String> runRule(Recording recording) {
        List<String> errors = new ArrayList<String>();
        // DO version one rules
        if(RulesUtilities.isBlankOrNull(recording.getTitle())){
            errors.add("Recording title is blank or null");
        }

        if(RulesUtilities.isBlankOrNull(recording.getArtist())){
            errors.add("Recording artist is blank or null");
        }
        return errors;
    }
}
