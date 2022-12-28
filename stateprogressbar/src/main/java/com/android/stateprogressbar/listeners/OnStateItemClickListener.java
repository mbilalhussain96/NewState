package com.android.stateprogressbar.listeners;


import com.android.stateprogressbar.StateProgressBar;
import com.android.stateprogressbar.components.StateItem;

/**
 * Created by Kofi Gyan on 2/20/2018.
 */

public interface OnStateItemClickListener {

    void onStateItemClick(StateProgressBar stateProgressBar, StateItem stateItem, int stateNumber, boolean isCurrentState);

}
