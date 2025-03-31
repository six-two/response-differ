package burp;

import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;

public class ResponseDiffer implements BurpExtension {

    @Override
    public void initialize(MontoyaApi api) {
        api.extension().setName("ResponseDiffer");

        api.userInterface().registerHttpResponseEditorProvider(new CustomResponseEditorProvider(api));
        api.userInterface().registerContextMenuItemsProvider(new CustomContextMenuItemsProvider(api));

        api.logging().logToOutput("ResponseDiffer extension loaded");
    }
}
