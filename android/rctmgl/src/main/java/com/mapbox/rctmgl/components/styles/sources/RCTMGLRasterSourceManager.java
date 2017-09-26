package com.mapbox.rctmgl.components.styles.sources;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

/**
 * Created by nickitaliano on 9/25/17.
 */

public class RCTMGLRasterSourceManager extends ViewGroupManager<RCTMGLRasterSource> {
    public static final String REACT_CLASS = RCTMGLRasterSource.class.getSimpleName();

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected RCTMGLRasterSource createViewInstance(ThemedReactContext reactContext) {
        return new RCTMGLRasterSource(reactContext);
    }

    @ReactProp(name="id")
    public void setID(RCTMGLRasterSource source, String id) {
        source.setID(id);
    }

    @ReactProp(name="url")
    public void setURL(RCTMGLRasterSource source, String url) {
        source.setURL(url);
    }

    @ReactProp(name="attribution")
    public void setAttribution(RCTMGLRasterSource source, String attribution) {
        source.setAttribution(attribution);
    }

    @ReactProp(name="tileSize")
    public void setTileSize(RCTMGLRasterSource source, int tileSize) {
        source.setTileSize(tileSize);
    }

    @ReactProp(name="minZoomLevel")
    public void setMinZoomLevel(RCTMGLRasterSource source, int minZoomLevel) {
        source.setMinZoomLevel(minZoomLevel);
    }

    @ReactProp(name="maxZoomLevel")
    public void setMaxZoomLevel(RCTMGLRasterSource source, int maxZoomLevel) {
        source.setMaxZoomLevel(maxZoomLevel);
    }

    @ReactProp(name="tms")
    public void setTMS(RCTMGLRasterSource source, boolean tms) {
        source.setTMS(tms);
    }
}
