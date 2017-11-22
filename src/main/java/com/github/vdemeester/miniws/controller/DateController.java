package com.github.vdemeester.miniws.controller;

import com.github.vdemeester.miniws.feature.MiniwsFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.togglz.core.manager.FeatureManager;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/date")
public class DateController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DateController.class);

    @Autowired
    private FeatureManager manager;

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    LocalDateTime getDate() {
        // TODO Afficher la date courant (LocalDateTime.now()) si et seulement si la feature DATE_FEATURE est active
        // TODO Sinon, lever une exception
        return null;
    }
}
