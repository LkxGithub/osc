// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class NewsDetailFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.NewsDetailFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361959, "field 'mTvTitle'");
    target.mTvTitle = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362071, "field 'mTvTime'");
    target.mTvTime = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362072, "field 'mTvSource'");
    target.mTvSource = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.fragment.NewsDetailFragment target) {
    target.mTvTitle = null;
    target.mTvTime = null;
    target.mTvSource = null;
  }
}
