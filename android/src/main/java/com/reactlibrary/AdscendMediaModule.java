package com.rnadscend;

import com.adscendmedia.sdk.rest.model.Offer;
import com.adscendmedia.sdk.rest.video.RewardVideoListener;
import com.adscendmedia.sdk.ui.AdscendMediaWrapper;
import com.adscendmedia.sdk.ui.MarketResearchActivity;
import com.adscendmedia.sdk.ui.OffersActivity;
import com.adscendmedia.sdk.ui.RewardedVideoActivity;
import com.adscendmedia.sdk.util.ADOfferRequestListener;
import com.adscendmedia.sdk.util.CompletedOfferRequestListener;
import com.adscendmedia.sdk.util.JsonArrayRequestListener;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class AdscendMediaModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public AdscendMediaModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "AdscendMedia";
    }

    @ReactMethod
    public void showOfferWall(String publisherId, String adwallId, String subId1) {
        Intent intent = OffersActivity.getIntentForOfferWall(getCurrentActivity(), publisherId, adwallId, subId1);
        startActivity(intent);
    }

    @ReactMethod
    public void sampleMethod(String stringArgument, int numberArgument, Callback callback) {
        // TODO: Implement some actually useful functionality
        callback.invoke("Received numberArgument: " + numberArgument + " stringArgument: " + stringArgument);
    }
}
