package dom.turnoPaciente;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QTurnoAceptado extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<TurnoAceptado> implements PersistableExpression<TurnoAceptado>
{
    public static final QTurnoAceptado jdoCandidate = candidate("this");

    public static QTurnoAceptado candidate(String name)
    {
        return new QTurnoAceptado(null, name, 5);
    }

    public static QTurnoAceptado candidate()
    {
        return jdoCandidate;
    }

    public static QTurnoAceptado parameter(String name)
    {
        return new QTurnoAceptado(TurnoAceptado.class, name, ExpressionType.PARAMETER);
    }

    public static QTurnoAceptado variable(String name)
    {
        return new QTurnoAceptado(TurnoAceptado.class, name, ExpressionType.VARIABLE);
    }

    public final dom.turnoPaciente.QTurnoPaciente turno;
    public final ObjectExpression<org.apache.isis.applib.DomainObjectContainer> container;

    public QTurnoAceptado(PersistableExpression parent, String name, int depth)
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
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
    }

    public QTurnoAceptado(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.turno = new dom.turnoPaciente.QTurnoPaciente(this, "turno", 5);
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
    }
}
