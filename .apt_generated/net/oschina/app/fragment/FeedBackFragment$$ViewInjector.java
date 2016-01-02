// Generated code from Butter Knife. Do not modify!
package net.oschina.app.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class FeedBackFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.fragment.FeedBackFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362039, "field 'mEtContent'");
    target.mEtContent = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131362041, "field 'mEtContact'");
    target.mEtContact = (android.widget.EditText) view;
  }

  public static void reset(net.oschina.app.fragment.FeedBackFragment target) {
    target.mEtContent = null;
    target.mEtContact = null;
  }
}
