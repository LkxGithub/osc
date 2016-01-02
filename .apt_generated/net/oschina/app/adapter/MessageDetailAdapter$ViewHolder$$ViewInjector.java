// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MessageDetailAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.MessageDetailAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362234, "field 'content'");
    target.content = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362049, "field 'avatar'");
    target.avatar = (net.oschina.app.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131362071, "field 'time'");
    target.time = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.adapter.MessageDetailAdapter.ViewHolder target) {
    target.content = null;
    target.avatar = null;
    target.time = null;
  }
}
