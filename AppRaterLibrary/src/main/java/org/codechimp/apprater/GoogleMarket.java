package org.codechimp.apprater;

import android.content.Context;
import android.net.Uri;

public class GoogleMarket extends Market {

    @Override
    public Uri getMarketURI(Context context) {
        String marketLink = "market://details?id=";
        return Uri.parse(marketLink + Market.getPackageName(context));
    }
}
