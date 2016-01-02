// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class SoftwareAdapter$ViewHold$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.SoftwareAdapter.ViewHold target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361959, "field 'name'");
    target.name = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362280, "field 'des'");
    target.des = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.adapter.SoftwareAdapter.ViewHold target) {
    target.name = null;
    target.des = null;
  }
}
