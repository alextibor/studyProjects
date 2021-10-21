package com.springTranslater.controller;

import com.google.cloud.translate.v3.LocationName;
import com.google.cloud.translate.v3.TranslateTextRequest;
import com.google.cloud.translate.v3.TranslateTextResponse;
import com.google.cloud.translate.v3.Translation;
import com.google.cloud.translate.v3.TranslationServiceClient;
import java.io.IOException;

public class TranslationController {

    public static void translateTextWithModel(String inputText) throws IOException {
        // TODO(developer): Replace these variables before running the sample.
        String projectId = "YOUR-PROJECT-ID";
        // Supported Languages: https://cloud.google.com/translate/docs/languages
        String sourceLanguage = "your-source-language";
        String targetLanguage = "your-target-language";
        String text = "your-text";
        String modelId = "YOUR-MODEL-ID";
        translateTextWithModel(projectId, sourceLanguage, targetLanguage, text, modelId);
    }

    // Translating Text with Model
    public static void translateTextWithModel(
            String projectId, String sourceLanguage, String targetLanguage, String text, String modelId)
            throws IOException {

        // Initialize client that will be used to send requests. This client only needs to be created
        // once, and can be reused for multiple requests. After completing all of your requests, call
        // the "close" method on the client to safely clean up any remaining background resources.
        try (TranslationServiceClient client = TranslationServiceClient.create()) {
            // Supported Locations: `global`, [glossary location], or [model location]
            // Glossaries must be hosted in `us-central1`
            // Custom Models must use the same location as your model. (us-central1)
            String location = "us-central1";
            LocationName parent = LocationName.of(projectId, location);
            String modelPath =
                    String.format("projects/%s/locations/%s/models/%s", projectId, location, modelId);

            // Supported Mime Types: https://cloud.google.com/translate/docs/supported-formats
            TranslateTextRequest request =
                    TranslateTextRequest.newBuilder()
                            .setParent(parent.toString())
                            .setMimeType("text/plain")
                            .setSourceLanguageCode(sourceLanguage)
                            .setTargetLanguageCode(targetLanguage)
                            .addContents(text)
                            .setModel(modelPath)
                            .build();

            TranslateTextResponse response = client.translateText(request);

            // Display the translation for each input text provided
            for (Translation translation : response.getTranslationsList()) {
                System.out.printf("Translated text: %s\n", translation.getTranslatedText());
            }
        }
    }
}