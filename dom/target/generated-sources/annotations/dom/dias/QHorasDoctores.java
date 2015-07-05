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
    public final StringExpression sieteAm;
    public final StringExpression sieteTreintaAm;
    public final StringExpression ochoam;
    public final StringExpression ochoTreintaAm;
    public final StringExpression nueveAm;
    public final StringExpression nueveTreintaAm;
    public final StringExpression diezAm;
    public final StringExpression diezTreintaAm;
    public final StringExpression onceAm;
    public final StringExpression onceTreintaAm;
    public final StringExpression doceAm;
    public final StringExpression doceTreintaPm;
    public final StringExpression unaPm;
    public final StringExpression unaTreintaPm;
    public final StringExpression dosPm;
    public final StringExpression dosTreintaPm;
    public final StringExpression tresPm;
    public final StringExpression tresTreintaPm;
    public final StringExpression cuatroPm;
    public final StringExpression cuatroTreintaPm;
    public final StringExpression cincoPm;
    public final StringExpression cincoTreintaPm;
    public final StringExpression seisPm;
    public final StringExpression seisTreintaPm;
    public final StringExpression sietePm;
    public final StringExpression sieteTreintaPm;
    public final StringExpression ochoPm;
    public final StringExpression ochoTreintaPm;

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
        this.sieteAm = new StringExpressionImpl(this, "sieteAm");
        this.sieteTreintaAm = new StringExpressionImpl(this, "sieteTreintaAm");
        this.ochoam = new StringExpressionImpl(this, "ochoam");
        this.ochoTreintaAm = new StringExpressionImpl(this, "ochoTreintaAm");
        this.nueveAm = new StringExpressionImpl(this, "nueveAm");
        this.nueveTreintaAm = new StringExpressionImpl(this, "nueveTreintaAm");
        this.diezAm = new StringExpressionImpl(this, "diezAm");
        this.diezTreintaAm = new StringExpressionImpl(this, "diezTreintaAm");
        this.onceAm = new StringExpressionImpl(this, "onceAm");
        this.onceTreintaAm = new StringExpressionImpl(this, "onceTreintaAm");
        this.doceAm = new StringExpressionImpl(this, "doceAm");
        this.doceTreintaPm = new StringExpressionImpl(this, "doceTreintaPm");
        this.unaPm = new StringExpressionImpl(this, "unaPm");
        this.unaTreintaPm = new StringExpressionImpl(this, "unaTreintaPm");
        this.dosPm = new StringExpressionImpl(this, "dosPm");
        this.dosTreintaPm = new StringExpressionImpl(this, "dosTreintaPm");
        this.tresPm = new StringExpressionImpl(this, "tresPm");
        this.tresTreintaPm = new StringExpressionImpl(this, "tresTreintaPm");
        this.cuatroPm = new StringExpressionImpl(this, "cuatroPm");
        this.cuatroTreintaPm = new StringExpressionImpl(this, "cuatroTreintaPm");
        this.cincoPm = new StringExpressionImpl(this, "cincoPm");
        this.cincoTreintaPm = new StringExpressionImpl(this, "cincoTreintaPm");
        this.seisPm = new StringExpressionImpl(this, "seisPm");
        this.seisTreintaPm = new StringExpressionImpl(this, "seisTreintaPm");
        this.sietePm = new StringExpressionImpl(this, "sietePm");
        this.sieteTreintaPm = new StringExpressionImpl(this, "sieteTreintaPm");
        this.ochoPm = new StringExpressionImpl(this, "ochoPm");
        this.ochoTreintaPm = new StringExpressionImpl(this, "ochoTreintaPm");
    }

    public QHorasDoctores(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.doctor = new dom.doctor.QDoctor(this, "doctor", 5);
        this.sieteAm = new StringExpressionImpl(this, "sieteAm");
        this.sieteTreintaAm = new StringExpressionImpl(this, "sieteTreintaAm");
        this.ochoam = new StringExpressionImpl(this, "ochoam");
        this.ochoTreintaAm = new StringExpressionImpl(this, "ochoTreintaAm");
        this.nueveAm = new StringExpressionImpl(this, "nueveAm");
        this.nueveTreintaAm = new StringExpressionImpl(this, "nueveTreintaAm");
        this.diezAm = new StringExpressionImpl(this, "diezAm");
        this.diezTreintaAm = new StringExpressionImpl(this, "diezTreintaAm");
        this.onceAm = new StringExpressionImpl(this, "onceAm");
        this.onceTreintaAm = new StringExpressionImpl(this, "onceTreintaAm");
        this.doceAm = new StringExpressionImpl(this, "doceAm");
        this.doceTreintaPm = new StringExpressionImpl(this, "doceTreintaPm");
        this.unaPm = new StringExpressionImpl(this, "unaPm");
        this.unaTreintaPm = new StringExpressionImpl(this, "unaTreintaPm");
        this.dosPm = new StringExpressionImpl(this, "dosPm");
        this.dosTreintaPm = new StringExpressionImpl(this, "dosTreintaPm");
        this.tresPm = new StringExpressionImpl(this, "tresPm");
        this.tresTreintaPm = new StringExpressionImpl(this, "tresTreintaPm");
        this.cuatroPm = new StringExpressionImpl(this, "cuatroPm");
        this.cuatroTreintaPm = new StringExpressionImpl(this, "cuatroTreintaPm");
        this.cincoPm = new StringExpressionImpl(this, "cincoPm");
        this.cincoTreintaPm = new StringExpressionImpl(this, "cincoTreintaPm");
        this.seisPm = new StringExpressionImpl(this, "seisPm");
        this.seisTreintaPm = new StringExpressionImpl(this, "seisTreintaPm");
        this.sietePm = new StringExpressionImpl(this, "sietePm");
        this.sieteTreintaPm = new StringExpressionImpl(this, "sieteTreintaPm");
        this.ochoPm = new StringExpressionImpl(this, "ochoPm");
        this.ochoTreintaPm = new StringExpressionImpl(this, "ochoTreintaPm");
    }
}
