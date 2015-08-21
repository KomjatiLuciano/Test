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

    public final StringExpression ingresoEgreso;

    public QHorasTrabajadas(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.ingresoEgreso = new StringExpressionImpl(this, "ingresoEgreso");
    }

    public QHorasTrabajadas(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.ingresoEgreso = new StringExpressionImpl(this, "ingresoEgreso");
    }
}
