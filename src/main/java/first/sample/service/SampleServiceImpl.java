package first.sample.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import first.sample.dao.SampleDAO;

@Service("sampleService")
public class SampleServiceImpl implements SampleService{
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="smapleDAO")
	private SampleDAO sampleDAO;
	
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		return SampleDAO.selectBoardList(map);
	}
	
	
	

}
