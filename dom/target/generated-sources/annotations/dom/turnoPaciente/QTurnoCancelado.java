package dom.turnoPaciente;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QTurnoCancelado extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<TurnoCancelado> implements PersistableExpression<TurnoCancelado>
{
    public static final QTurnoCancelado jdoCandidate = candidate("this");

    public static QTurnoCancelado candidate(String name)
    {
        return new QTurnoCancelado(null, name, 5);
    }

    public static QTurnoCancelado candidate()
    {
        return jdoCandidate;
    }

    public static QTurnoCancelado parameter(String name)
    {
        return new QTurnoCancelado(TurnoCancelado.class, name, ExpressionType.PARAMETER);
    }

    public static QTurnoCancelado variable(String name)
    {
        return new QTurnoCancelado(TurnoCancelado.class, name, ExpressionType.VARIABLE);
    }

    public final dom.turnoPaciente.QTurnoPaciente turno;

    public QTurnoCancelado(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        if (depth > 0)
        {
            this.turno = new dom.turnoPaciente.QTurnoPaciente(this, "turno", depth-1);
        }
        else
        {
            this.turno = null;
        }
    }

    public QTurnoCancelado(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.turno = new dom.turnoPaciente.QTurnoPaciente(this, "turno", 5);
    }
}
