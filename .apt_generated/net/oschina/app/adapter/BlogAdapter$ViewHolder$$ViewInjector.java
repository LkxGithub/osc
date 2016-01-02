// Generated code from Butter Knife. Do not modify!
package net.oschina.app.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class BlogAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.adapter.BlogAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362072, "field 'source'");
    target.source = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362273, "field 'description'");
    target.description = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362071, "field 'time'");
    target.time = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362272, "field 'tip'");
    target.tip = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131361986, "field 'comment_count'");
    target.comment_count = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361959, "field 'title'");
    target.title = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.adapter.BlogAdapter.ViewHolder target) {
    target.source = null;
    target.description = null;
    target.time = null;
    target.tip = null;
    target.comment_count = null;
    target.title = null;
  }
}
