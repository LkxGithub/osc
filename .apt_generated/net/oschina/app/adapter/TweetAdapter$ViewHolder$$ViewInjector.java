// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TweetAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.TweetAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362309, "field 'platform'");
    target.platform = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362312, "field 'likeOption'");
    target.likeOption = view;
    view = finder.findRequiredView(source, 2131362311, "field 'commentcount'");
    target.commentcount = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362308, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362305, "field 'content'");
    target.content = (net.oschina.app.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131362315, "field 'likeUsers'");
    target.likeUsers = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362306, "field 'image'");
    target.image = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362304, "field 'author'");
    target.author = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362314, "field 'del'");
    target.del = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362313, "field 'likeState'");
    target.likeState = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131362303, "field 'face'");
    target.face = (net.oschina.app.widget.AvatarView) view;
  }

  public static void reset(net.oschina.app.adapter.TweetAdapter.ViewHolder target) {
    target.platform = null;
    target.likeOption = null;
    target.commentcount = null;
    target.time = null;
    target.content = null;
    target.likeUsers = null;
    target.image = null;
    target.author = null;
    target.del = null;
    target.likeState = null;
    target.face = null;
  }
}
