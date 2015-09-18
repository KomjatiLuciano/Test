package dom.ciudadProvincia;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QProvincia extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Provincia> implements PersistableExpression<Provincia>
{
    public static final QProvincia jdoCandidate = candidate("this");

    public static QProvincia candidate(String name)
    {
        return new QProvincia(null, name, 5);
    }

    public static QProvincia candidate()
    {
        return jdoCandidate;
    }

    public static QProvincia parameter(String name)
    {
        return new QProvincia(Provincia.class, name, ExpressionType.PARAMETER);
    }

    public static QProvincia variable(String name)
    {
        return new QProvincia(Provincia.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression nombre;

    public QProvincia(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.nombre = new StringExpressionImpl(this, "nombre");
    }

    public QProvincia(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.nombre = new StringExpressionImpl(this, "nombre");
    }
}
