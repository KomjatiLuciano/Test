package dom.agendaDoctor;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QAgendaDoctor extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<AgendaDoctor> implements PersistableExpression<AgendaDoctor>
{
    public static final QAgendaDoctor jdoCandidate = candidate("this");

    public static QAgendaDoctor candidate(String name)
    {
        return new QAgendaDoctor(null, name, 5);
    }

    public static QAgendaDoctor candidate()
    {
        return jdoCandidate;
    }

    public static QAgendaDoctor parameter(String name)
    {
        return new QAgendaDoctor(AgendaDoctor.class, name, ExpressionType.PARAMETER);
    }

    public static QAgendaDoctor variable(String name)
    {
        return new QAgendaDoctor(AgendaDoctor.class, name, ExpressionType.VARIABLE);
    }

    public final DateTimeExpression dia;
    public final dom.doctor.QDoctor doctor;

    public QAgendaDoctor(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.dia = new DateTimeExpressionImpl(this, "dia");
        if (depth > 0)
        {
            this.doctor = new dom.doctor.QDoctor(this, "doctor", depth-1);
        }
        else
        {
            this.doctor = null;
        }
    }

    public QAgendaDoctor(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.dia = new DateTimeExpressionImpl(this, "dia");
        this.doctor = new dom.doctor.QDoctor(this, "doctor", 5);
    }
}
