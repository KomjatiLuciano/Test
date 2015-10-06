package dom.turnoPaciente;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QDisponible extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Disponible> implements PersistableExpression<Disponible>
{
    public static final QDisponible jdoCandidate = candidate("this");

    public static QDisponible candidate(String name)
    {
        return new QDisponible(null, name, 5);
    }

    public static QDisponible candidate()
    {
        return jdoCandidate;
    }

    public static QDisponible parameter(String name)
    {
        return new QDisponible(Disponible.class, name, ExpressionType.PARAMETER);
    }

    public static QDisponible variable(String name)
    {
        return new QDisponible(Disponible.class, name, ExpressionType.VARIABLE);
    }

    public final dom.turnoPaciente.QTurnoPaciente turno;

    public QDisponible(PersistableExpression parent, String name, int depth)
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

    public QDisponible(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.turno = new dom.turnoPaciente.QTurnoPaciente(this, "turno", 5);
    }
}
