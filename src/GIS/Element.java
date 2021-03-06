package GIS;

import Coords.MyCoords;
import Geom.Geom_element;
import Geom.Point3D;

public class Element implements GIS_element
{

	@Override
	public Geom_element getGeom()
	{
		return _Geom;
	}

	/**
	 * computes a new point which is the gps point transformed by a 3D vector(in meters)
	 * @param vec is Point3D that I need to add to my Geom
	 */
	
	@Override
	public void translate(Point3D vec)
	{
		MyCoords coords = new MyCoords();
		_Geom = coords.add(_Geom, vec);
	}
	
	//**********Constructor**********//

	public Element() {}

	public Element(Geom_element Pos , Meta_data m)
	{
		this._Geom = (Point3D) Pos;
		this._M = m;
	}
	
	public void ElementSet(String name, String descript, String point, String time)
	{
		this._Name = name;
		this._Descript = descript;
		this._Point = point;
		this._Time = time;
		this._M = new Metadata();
	}

	//**********Private Methods**********//
	private String _Descript;
	private String _Name;
	private String _Time;
	private String _Point;
	private Meta_data _M;
	private Point3D _Geom;

	//**********Getters**********//

	@Override
	public Meta_data getData() {
		return _M;
	}

	public String getPoint() {
		return _Point;
	}

	public String getDescript() {
		return _Descript;
	}

	public String getName() {
		return _Name;
	}

	public String getTime() {
		return _Time;
	}
}
