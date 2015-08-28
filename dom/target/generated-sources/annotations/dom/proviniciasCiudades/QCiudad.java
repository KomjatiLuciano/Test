package dom.proviniciasCiudades;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QCiudad extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Ciudad> implements PersistableExpression<Ciudad>
{
    public static final QCiudad jdoCandidate = candidate("this");

    public static QCiudad candidate(String name)
    {
        return new QCiudad(null, name, 5);
    }

    public static QCiudad candidate()
    {
        return jdoCandidate;
    }

    public static QCiudad parameter(String name)
    {
        return new QCiudad(Ciudad.class, name, ExpressionType.PARAMETER);
    }

    public static QCiudad variable(String name)
    {
        return new QCiudad(Ciudad.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression nombre;
    public final ObjectExpression<dom.proviniciasCiudades.ProvinciaEnum> provincia;

    public QCiudad(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.provincia = new ObjectExpressionImpl<dom.proviniciasCiudades.ProvinciaEnum>(this, "provincia");
    }

    public QCiudad(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.provincia = new ObjectExpressionImpl<dom.proviniciasCiudades.ProvinciaEnum>(this, "provincia");
    }
}
