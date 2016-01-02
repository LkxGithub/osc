// Generated code from Butter Knife. Do not modify!
package net.oschina.app.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class EventApplyDialog$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.ui.EventApplyDialog target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361938, "field 'mMobile'");
    target.mMobile = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131361937, "field 'mGender'");
    target.mGender = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131361939, "field 'mCompany'");
    target.mCompany = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131361940, "field 'mJob'");
    target.mJob = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131361936, "field 'mName'");
    target.mName = (android.widget.EditText) view;
  }

  public static void reset(net.oschina.app.ui.EventApplyDialog target) {
    target.mMobile = null;
    target.mGender = null;
    target.mCompany = null;
    target.mJob = null;
    target.mName = null;
  }
}
