package dom.turnoPaciente;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QAceptado extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Aceptado> implements PersistableExpression<Aceptado>
{
    public static final QAceptado jdoCandidate = candidate("this");

    public static QAceptado candidate(String name)
    {
        return new QAceptado(null, name, 5);
    }

    public static QAceptado candidate()
    {
        return jdoCandidate;
    }

    public static QAceptado parameter(String name)
    {
        return new QAceptado(Aceptado.class, name, ExpressionType.PARAMETER);
    }

    public static QAceptado variable(String name)
    {
        return new QAceptado(Aceptado.class, name, ExpressionType.VARIABLE);
    }

    public final dom.turnoPaciente.QTurnoPaciente turno;

    public QAceptado(PersistableExpression parent, String name, int depth)
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

    public QAceptado(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.turno = new dom.turnoPaciente.QTurnoPaciente(this, "turno", 5);
    }
}
