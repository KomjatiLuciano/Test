package dom.obraSocial;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QObraSocial extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<ObraSocial> implements PersistableExpression<ObraSocial>
{
    public static final QObraSocial jdoCandidate = candidate("this");

    public static QObraSocial candidate(String name)
    {
        return new QObraSocial(null, name, 5);
    }

    public static QObraSocial candidate()
    {
        return jdoCandidate;
    }

    public static QObraSocial parameter(String name)
    {
        return new QObraSocial(ObraSocial.class, name, ExpressionType.PARAMETER);
    }

    public static QObraSocial variable(String name)
    {
        return new QObraSocial(ObraSocial.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression nombre;
    public final StringExpression coberturaMedica;
    public final ObjectExpression<dom.estado.EstadoEnum> estado;

    public QObraSocial(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.coberturaMedica = new StringExpressionImpl(this, "coberturaMedica");
        this.estado = new ObjectExpressionImpl<dom.estado.EstadoEnum>(this, "estado");
    }

    public QObraSocial(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.coberturaMedica = new StringExpressionImpl(this, "coberturaMedica");
        this.estado = new ObjectExpressionImpl<dom.estado.EstadoEnum>(this, "estado");
    }
}
