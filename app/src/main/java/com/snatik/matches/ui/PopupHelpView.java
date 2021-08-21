package com.snatik.matches.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.snatik.matches.R;
import com.snatik.matches.common.Music;
import com.snatik.matches.common.Shared;
import com.snatik.matches.utils.FontLoader;
import com.snatik.matches.utils.FontLoader.Font;

public class PopupHelpView extends LinearLayout {

	private ImageView mSoundImage;
	private TextView mSoundText;

	public PopupHelpView(Context context) {
		this(context, null);
	}

	public PopupHelpView(Context context, AttributeSet attrs) {
		super(context, attrs);
		setOrientation(LinearLayout.VERTICAL);
		setBackgroundResource(R.drawable.show_help);
		LayoutInflater.from(getContext()).inflate(R.layout.popup_show_view, this, true);
	}
}
