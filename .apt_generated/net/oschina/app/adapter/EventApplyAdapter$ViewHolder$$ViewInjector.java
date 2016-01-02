// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class EventApplyAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.EventApplyAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362233, "field 'from'");
    target.from = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362053, "field 'gender'");
    target.gender = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362049, "field 'avatar'");
    target.avatar = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362255, "field 'desc'");
    target.desc = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362050, "field 'name'");
    target.name = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.adapter.EventApplyAdapter.ViewHolder target) {
    target.from = null;
    target.gender = null;
    target.avatar = null;
    target.desc = null;
    target.name = null;
  }
}
