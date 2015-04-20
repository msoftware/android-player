package com.eftimoff.androidplayer.actions;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/**
 * Base Action with some mandatory fields.
 * <p/>
 * Created by georgi.eftimov on 4/15/2015.
 */
public abstract class BaseAction implements Action {

    private View view;
    private int duration = 300;
    private int delay = 0;
    private boolean animateAlone;
    private TimeInterpolator interpolator = new AccelerateDecelerateInterpolator();

    public BaseAction(final View view) {
        this.view = view;
    }

    public View getView() {
        return view;
    }

    public int getDuration() {
        return duration;
    }

    public int getDelay() {
        return delay;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public boolean isAnimateAlone() {
        return animateAlone;
    }

    public void setAnimateAlone(boolean animateAlone) {
        this.animateAlone = animateAlone;
    }

    public TimeInterpolator getInterpolator() {
        return interpolator;
    }

    public void setInterpolator(TimeInterpolator interpolator) {
        this.interpolator = interpolator;
    }
}
