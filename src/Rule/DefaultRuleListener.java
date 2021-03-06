package Rule;

import Validator.Validator;

public class DefaultRuleListener implements RuleListener{
    protected RulesManager manager;

    public DefaultRuleListener(RulesManager manager) {
        this.manager = manager;
    }

    public String getRuleName(Validator<?> validator) {
        return manager.getRuleName(validator.getRuleID());
    }

    @Override
    public boolean checkRule(Validator<?> validator) {
        return manager.checkRule(validator.getRuleID(), validator.getValue());
    }
}
