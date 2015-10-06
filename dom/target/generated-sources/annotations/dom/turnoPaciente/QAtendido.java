package dom.turnoPaciente;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QAtendido extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Atendido> implements PersistableExpression<Atendido>
{
    public static final QAtendido jdoCandidate = candidate("this");

    public static QAtendido candidate(String name)
    {
        return new QAtendido(null, name, 5);
    }

    public static QAtendido candidate()
    {
        return jdoCandidate;
    }

    public static QAtendido parameter(String name)
    {
        return new QAtendido(Atendido.class, name, ExpressionType.PARAMETER);
    }

    public static QAtendido variable(String name)
    {
        return new QAtendido(Atendido.class, name, ExpressionType.VARIABLE);
    }

    public final dom.turnoPaciente.QTurnoPaciente turno;

    public QAtendido(PersistableExpression parent, String name, int depth)
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

    public QAtendido(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.turno = new dom.turnoPaciente.QTurnoPaciente(this, "turno", 5);
    }
}
