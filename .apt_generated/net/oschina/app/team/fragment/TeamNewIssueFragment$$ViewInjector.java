// Generated code from Butter Knife. Do not modify!
package net.oschina.app.team.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class TeamNewIssueFragment$$ViewInjector {
  public static void inject(Finder finder, final net.oschina.app.team.fragment.TeamNewIssueFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131362149, "field 'mTvProject'");
    target.mTvProject = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362191, "field 'mTvTime'");
    target.mTvTime = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362192, "field 'mRlGitPush'");
    target.mRlGitPush = view;
    view = finder.findRequiredView(source, 2131362181, "field 'mEtTitle'");
    target.mEtTitle = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131362194, "field 'mCbPush'");
    target.mCbPush = (android.widget.CheckBox) view;
    view = finder.findRequiredView(source, 2131362195, "field 'mPushLine'");
    target.mPushLine = view;
    view = finder.findRequiredView(source, 2131362193, "field 'mTvPushSource'");
    target.mTvPushSource = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362186, "field 'mTvCatalog'");
    target.mTvCatalog = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131362159, "field 'mTvToUser'");
    target.mTvToUser = (android.widget.TextView) view;
  }

  public static void reset(net.oschina.app.team.fragment.TeamNewIssueFragment target) {
    target.mTvProject = null;
    target.mTvTime = null;
    target.mRlGitPush = null;
    target.mEtTitle = null;
    target.mCbPush = null;
    target.mPushLine = null;
    target.mTvPushSource = null;
    target.mTvCatalog = null;
    target.mTvToUser = null;
  }
}
