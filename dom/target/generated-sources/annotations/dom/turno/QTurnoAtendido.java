package dom.turno;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QTurnoAtendido extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<TurnoAtendido> implements PersistableExpression<TurnoAtendido>
{
    public static final QTurnoAtendido jdoCandidate = candidate("this");

    public static QTurnoAtendido candidate(String name)
    {
        return new QTurnoAtendido(null, name, 5);
    }

    public static QTurnoAtendido candidate()
    {
        return jdoCandidate;
    }

    public static QTurnoAtendido parameter(String name)
    {
        return new QTurnoAtendido(TurnoAtendido.class, name, ExpressionType.PARAMETER);
    }

    public static QTurnoAtendido variable(String name)
    {
        return new QTurnoAtendido(TurnoAtendido.class, name, ExpressionType.VARIABLE);
    }

    public final dom.turno.QTurno turno;

    public QTurnoAtendido(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        if (depth > 0)
        {
            this.turno = new dom.turno.QTurno(this, "turno", depth-1);
        }
        else
        {
            this.turno = null;
        }
    }

    public QTurnoAtendido(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.turno = new dom.turno.QTurno(this, "turno", 5);
    }
}
