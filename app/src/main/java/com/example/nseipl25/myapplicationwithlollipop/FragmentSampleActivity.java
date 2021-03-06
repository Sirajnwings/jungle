package com.example.nseipl25.myapplicationwithlollipop;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.TextView;

import com.example.nseipl25.animation.RevealLayout;

import java.util.List;

public class FragmentSampleActivity extends AppCompatActivity
{

    private boolean mIsInBackAnimation = false;

    String  a,b,e;

    String dummy,c,d;

    String q;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragment);

        if (savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().add(R.id.container, SimpleFragment.newInstance(0)).commit();
        }
    }

    public static class SimpleFragment extends Fragment
    {
        private static final int[] COLOR_LIST = new int[]{ 0xff33b5e5, 0xff99cc00, 0xffff8800, 0xffaa66cc, 0xffff4444,};

        private RevealLayout mRevealLayout;

        private TextView mTextView;

        private int mIndex;

        public static SimpleFragment newInstance(int index)
        {
            SimpleFragment fragment = new SimpleFragment();

            Bundle args = new Bundle();

            args.putInt("index", index);

            fragment.setArguments(args);

            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
        {
            View rootView = inflater.inflate(R.layout.fragment_simple, container, false);

            mRevealLayout = (RevealLayout) rootView.findViewById(R.id.reveal_layout);

            mTextView = (TextView) rootView.findViewById(R.id.text);

            mIndex = getArguments().getInt("index");

            mTextView.setBackgroundColor(COLOR_LIST[mIndex % 5]);

            mTextView.setText("Fragment " + mIndex);

            mRevealLayout.setContentShown(false);

            mRevealLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
            {
                @Override
                public void onGlobalLayout()
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN)
                    {
                        mRevealLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    else
                    {
                        //noinspection deprecation
                        mRevealLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    mRevealLayout.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            mRevealLayout.show();
                        }
                    }, 50);
                }
            });
            mRevealLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    getFragmentManager().beginTransaction().addToBackStack(null).add(R.id.container, SimpleFragment.newInstance(mIndex + 1)).commit();
                }
            });
            return rootView;
        }

        public void onBackPressed(Animation.AnimationListener listener) { mRevealLayout.hide(listener); }
    }
}
