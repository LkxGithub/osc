// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TweetRecordFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.TweetRecordFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362242, "field 'mBtnRecort'");
    target.mBtnRecort = (net.oschina.app.widget.RecordButton) view;
    view = finder.findRequiredView(source, 2131362236, "field 'mEtSpeech'");
    target.mEtSpeech = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131362240, "field 'mImgVolume'");
    target.mImgVolume = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362238, "field 'mLayout'");
    target.mLayout = (android.widget.RelativeLayout) view;
    view = finder.findRequiredView(source, 2131362241, "field 'mTvTime'");
    target.mTvTime = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362237, "field 'mTvInputLen'");
    target.mTvInputLen = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.fragment.TweetRecordFragment target) {
    target.mBtnRecort = null;
    target.mEtSpeech = null;
    target.mImgVolume = null;
    target.mLayout = null;
    target.mTvTime = null;
    target.mTvInputLen = null;
  }
}
