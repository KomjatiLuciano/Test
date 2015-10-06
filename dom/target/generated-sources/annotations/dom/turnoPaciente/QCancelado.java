package dom.turnoPaciente;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCancelado extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Cancelado> implements PersistableExpression<Cancelado>
{
    public static final QCancelado jdoCandidate = candidate("this");

    public static QCancelado candidate(String name)
    {
        return new QCancelado(null, name, 5);
    }

    public static QCancelado candidate()
    {
        return jdoCandidate;
    }

    public static QCancelado parameter(String name)
    {
        return new QCancelado(Cancelado.class, name, ExpressionType.PARAMETER);
    }

    public static QCancelado variable(String name)
    {
        return new QCancelado(Cancelado.class, name, ExpressionType.VARIABLE);
    }

    public final dom.turnoPaciente.QTurnoPaciente turno;

    public QCancelado(PersistableExpression parent, String name, int depth)
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

    public QCancelado(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.turno = new dom.turnoPaciente.QTurnoPaciente(this, "turno", 5);
    }
}
