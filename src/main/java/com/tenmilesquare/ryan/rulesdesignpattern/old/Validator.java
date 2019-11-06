package com.tenmilesquare.ryan.rulesdesignpattern.old;

import com.tenmilesquare.ryan.rulesdesignpattern.Recording;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Validator {

    private boolean isBlankOrNull(String str){
        return str == null || str == "";
    }

    public List<String> validateRecordings(Recording recording){

        if (recording == null){
            return Arrays.asList("Recording was null");
        }

        List<String> errors = new ArrayList<String>();

        if (Recording.RECORDING_VERSIONS.v1.equals(recording.getVersion())){
            // DO version one rules
            if(isBlankOrNull(recording.getTitle())){
                errors.add("Recording title is blank or null");
            }

            if(isBlankOrNull(recording.getArtist())){
                errors.add("Recording artist is blank or null");
            }
        }else if (Recording.RECORDING_VERSIONS.v2.equals(recording.getVersion())){
            // DO version two rules
            if(isBlankOrNull(recording.getTitle())){
                errors.add("Recording title is blank or null");
            }

            if(isBlankOrNull(recording.getArtist())){
                errors.add("Recording artist is blank or null");
            }
            if(isBlankOrNull(recording.getComposer())){
                errors.add("Recording composer is blank or null");
            }
        }else {
            throw new RuntimeException("Unsupported version type " + recording.getVersion());
        }

        return errors;
    }
}
