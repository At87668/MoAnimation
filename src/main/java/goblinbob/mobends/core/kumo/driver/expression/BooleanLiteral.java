package goblinbob.mobends.core.kumo.driver.expression;

import goblinbob.bendslib.serial.ISerialInput;
import goblinbob.bendslib.serial.ISerialOutput;
import goblinbob.mobends.core.data.IEntityData;
import goblinbob.mobends.core.kumo.IKumoContext;
import goblinbob.mobends.core.kumo.IKumoInstancingContext;
import goblinbob.mobends.core.kumo.ISerialContext;

import java.io.IOException;

/**
 * This class acts both as a state and a template, because it doesn't hold any mutable internal state.
 * @param <D>
 */
public class BooleanLiteral<D extends IEntityData> extends ExpressionTemplate implements IExpression<D>
{
    boolean value;

    public BooleanLiteral(boolean value)
    {
        this.value = value;
    }

    @Override
    public boolean resolveBoolean(IKumoContext<D> context)
    {
        return value;
    }

    @Override
    public <D extends IEntityData> IExpression<D> instantiate(IKumoInstancingContext<D> context)
    {
        //noinspection unchecked
        return (IExpression<D>) this;
    }

    @Override
    public void serialize(ISerialOutput out)
    {
        super.serialize(out);

        out.writeBoolean(this.value);
    }

    public static <D extends IEntityData, C extends ISerialContext<C, D>> BooleanLiteral<D> deserialize(C context, ISerialInput in) throws IOException
    {
        return new BooleanLiteral<D>(in.readBoolean());
    }
}
