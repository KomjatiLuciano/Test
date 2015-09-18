package dom.doctor;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QHorasTrabajadas extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<HorasTrabajadas> implements PersistableExpression<HorasTrabajadas>
{
    public static final QHorasTrabajadas jdoCandidate = candidate("this");

    public static QHorasTrabajadas candidate(String name)
    {
        return new QHorasTrabajadas(null, name, 5);
    }

    public static QHorasTrabajadas candidate()
    {
        return jdoCandidate;
    }

    public static QHorasTrabajadas parameter(String name)
    {
        return new QHorasTrabajadas(HorasTrabajadas.class, name, ExpressionType.PARAMETER);
    }

    public static QHorasTrabajadas variable(String name)
    {
        return new QHorasTrabajadas(HorasTrabajadas.class, name, ExpressionType.VARIABLE);
    }

    public final dom.doctor.QDoctor doctor;
    public final StringExpression ingresoEgreso;

    public QHorasTrabajadas(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        if (depth > 0)
        {
            this.doctor = new dom.doctor.QDoctor(this, "doctor", depth-1);
        }
        else
        {
            this.doctor = null;
        }
        this.ingresoEgreso = new StringExpressionImpl(this, "ingresoEgreso");
    }

    public QHorasTrabajadas(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.doctor = new dom.doctor.QDoctor(this, "doctor", 5);
        this.ingresoEgreso = new StringExpressionImpl(this, "ingresoEgreso");
    }
}
