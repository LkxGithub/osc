// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ShakeFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.ShakeFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362105, "field 'mLayoutBottom'");
    target.mLayoutBottom = (android.widget.LinearLayout) view;
    view = finder.findRequiredView(source, 2131361998, "field 'mProgress'");
    target.mProgress = (android.widget.ProgressBar) view;
    view = finder.findRequiredView(source, 2131361984, "field 'mTvCommentCount'");
    target.mTvCommentCount = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362104, "field 'mImgShake'");
    target.mImgShake = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131361985, "field 'mTvDate'");
    target.mTvDate = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361980, "field 'mImgHead'");
    target.mImgHead = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131361982, "field 'mTvDetail'");
    target.mTvDetail = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361981, "field 'mTvTitle'");
    target.mTvTitle = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361983, "field 'mTvAuthor'");
    target.mTvAuthor = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.fragment.ShakeFragment target) {
    target.mLayoutBottom = null;
    target.mProgress = null;
    target.mTvCommentCount = null;
    target.mImgShake = null;
    target.mTvDate = null;
    target.mImgHead = null;
    target.mTvDetail = null;
    target.mTvTitle = null;
    target.mTvAuthor = null;
  }
}
