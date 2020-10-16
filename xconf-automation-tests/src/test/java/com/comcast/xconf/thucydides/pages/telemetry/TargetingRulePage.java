/* 
 * If not stated otherwise in this file or this component's Licenses.txt file the 
 * following copyright and licenses apply:
 *
 * Copyright 2018 RDK Management
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author: rdolomansky
 * Created: 3/16/16  8:44 PM
 */
package com.comcast.xconf.thucydides.pages.telemetry;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("/targetingrule/all")
public class TargetingRulePage extends PageObject {

    @FindBy(css = "#name")
    private WebElementFacade nameInput;

    @FindBy(css = "#boundTelemetryId")
    private WebElementFacade boundTelemetryIdSelect;


    public void typeName(final String value) {
        nameInput.type(value);
    }

    public void typeBoundTelemetryId(final String value) {
        boundTelemetryIdSelect.selectByVisibleText(value);
    }


}
