package dom.turno;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QTurnoDisponible extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<TurnoDisponible> implements PersistableExpression<TurnoDisponible>
{
    public static final QTurnoDisponible jdoCandidate = candidate("this");

    public static QTurnoDisponible candidate(String name)
    {
        return new QTurnoDisponible(null, name, 5);
    }

    public static QTurnoDisponible candidate()
    {
        return jdoCandidate;
    }

    public static QTurnoDisponible parameter(String name)
    {
        return new QTurnoDisponible(TurnoDisponible.class, name, ExpressionType.PARAMETER);
    }

    public static QTurnoDisponible variable(String name)
    {
        return new QTurnoDisponible(TurnoDisponible.class, name, ExpressionType.VARIABLE);
    }

    public final dom.turno.QTurno turno;

    public QTurnoDisponible(PersistableExpression parent, String name, int depth)
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

    public QTurnoDisponible(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.turno = new dom.turno.QTurno(this, "turno", 5);
    }
}
