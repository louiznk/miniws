package com.github.vdemeester.miniws.feature;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;

public enum MiniwsFeatures implements Feature {

    @EnabledByDefault
    @Label("TodoFeature")
    TODO_FEATURE,

    @Label("DateFeature")
    DATE_FEATURE;

}
