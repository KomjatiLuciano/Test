package dom.dias;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QHorasDoctores extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<HorasDoctores> implements PersistableExpression<HorasDoctores>
{
    public static final QHorasDoctores jdoCandidate = candidate("this");

    public static QHorasDoctores candidate(String name)
    {
        return new QHorasDoctores(null, name, 5);
    }

    public static QHorasDoctores candidate()
    {
        return jdoCandidate;
    }

    public static QHorasDoctores parameter(String name)
    {
        return new QHorasDoctores(HorasDoctores.class, name, ExpressionType.PARAMETER);
    }

    public static QHorasDoctores variable(String name)
    {
        return new QHorasDoctores(HorasDoctores.class, name, ExpressionType.VARIABLE);
    }

    public final dom.doctor.QDoctor doctor;
    public final ObjectExpression<dom.dias.DiasEnum> diasDesde;
    public final ObjectExpression<dom.dias.DiasEnum> diasHasta;
    public final ObjectExpression<dom.dias.HorasMañanaEnum> horasMañanaDesde;
    public final ObjectExpression<dom.dias.HorasMañanaEnum> horasMañanaHasta;
    public final ObjectExpression<dom.dias.HorasTardeEnum> horasTardeDesde;
    public final ObjectExpression<dom.dias.HorasTardeEnum> horasTardeHasta;

    public QHorasDoctores(PersistableExpression parent, String name, int depth)
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
        this.diasDesde = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "diasDesde");
        this.diasHasta = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "diasHasta");
        this.horasMañanaDesde = new ObjectExpressionImpl<dom.dias.HorasMañanaEnum>(this, "horasMañanaDesde");
        this.horasMañanaHasta = new ObjectExpressionImpl<dom.dias.HorasMañanaEnum>(this, "horasMañanaHasta");
        this.horasTardeDesde = new ObjectExpressionImpl<dom.dias.HorasTardeEnum>(this, "horasTardeDesde");
        this.horasTardeHasta = new ObjectExpressionImpl<dom.dias.HorasTardeEnum>(this, "horasTardeHasta");
    }

    public QHorasDoctores(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.doctor = new dom.doctor.QDoctor(this, "doctor", 5);
        this.diasDesde = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "diasDesde");
        this.diasHasta = new ObjectExpressionImpl<dom.dias.DiasEnum>(this, "diasHasta");
        this.horasMañanaDesde = new ObjectExpressionImpl<dom.dias.HorasMañanaEnum>(this, "horasMañanaDesde");
        this.horasMañanaHasta = new ObjectExpressionImpl<dom.dias.HorasMañanaEnum>(this, "horasMañanaHasta");
        this.horasTardeDesde = new ObjectExpressionImpl<dom.dias.HorasTardeEnum>(this, "horasTardeDesde");
        this.horasTardeHasta = new ObjectExpressionImpl<dom.dias.HorasTardeEnum>(this, "horasTardeHasta");
    }
}
