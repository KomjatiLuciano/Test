package dom.turno;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QTurnoSolicitado extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<TurnoSolicitado> implements PersistableExpression<TurnoSolicitado>
{
    public static final QTurnoSolicitado jdoCandidate = candidate("this");

    public static QTurnoSolicitado candidate(String name)
    {
        return new QTurnoSolicitado(null, name, 5);
    }

    public static QTurnoSolicitado candidate()
    {
        return jdoCandidate;
    }

    public static QTurnoSolicitado parameter(String name)
    {
        return new QTurnoSolicitado(TurnoSolicitado.class, name, ExpressionType.PARAMETER);
    }

    public static QTurnoSolicitado variable(String name)
    {
        return new QTurnoSolicitado(TurnoSolicitado.class, name, ExpressionType.VARIABLE);
    }

    public final dom.turno.QAgenda agenda;

    public QTurnoSolicitado(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        if (depth > 0)
        {
            this.agenda = new dom.turno.QAgenda(this, "agenda", depth-1);
        }
        else
        {
            this.agenda = null;
        }
    }

    public QTurnoSolicitado(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.agenda = new dom.turno.QAgenda(this, "agenda", 5);
    }
}
