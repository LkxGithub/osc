// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TweetLikeAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.TweetLikeAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362233, "field 'from'");
    target.from = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362254, "field 'reply'");
    target.reply = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362250, "field 'action'");
    target.action = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362049, "field 'avatar'");
    target.avatar = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362071, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362050, "field 'name'");
    target.name = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.adapter.TweetLikeAdapter.ViewHolder target) {
    target.from = null;
    target.reply = null;
    target.action = null;
    target.avatar = null;
    target.time = null;
    target.name = null;
  }
}
