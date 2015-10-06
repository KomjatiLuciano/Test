package dom.turnoPaciente;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QSolicitado extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Solicitado> implements PersistableExpression<Solicitado>
{
    public static final QSolicitado jdoCandidate = candidate("this");

    public static QSolicitado candidate(String name)
    {
        return new QSolicitado(null, name, 5);
    }

    public static QSolicitado candidate()
    {
        return jdoCandidate;
    }

    public static QSolicitado parameter(String name)
    {
        return new QSolicitado(Solicitado.class, name, ExpressionType.PARAMETER);
    }

    public static QSolicitado variable(String name)
    {
        return new QSolicitado(Solicitado.class, name, ExpressionType.VARIABLE);
    }

    public final dom.turnoPaciente.QTurnoPaciente turno;

    public QSolicitado(PersistableExpression parent, String name, int depth)
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

    public QSolicitado(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.turno = new dom.turnoPaciente.QTurnoPaciente(this, "turno", 5);
    }
}
